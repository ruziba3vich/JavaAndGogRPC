package api

import (
	"log"

	"github.com/gin-gonic/gin"
	"github.com/ruziba3vich/java_and_go_grpc_server_practice/api/handlers"
	"google.golang.org/grpc"
	"google.golang.org/grpc/credentials/insecure"
)

type API struct {
	logger *log.Logger
}

func New(logger *log.Logger) *API {
	return &API{
		logger: logger,
	}
}

func (a *API) RUN(port string) error {
	conn, err := grpc.NewClient("localhost:7777", grpc.WithTransportCredentials(insecure.NewCredentials()))
	if err != nil {
		return err
	}
	handler := handlers.New(a.logger, conn)

	router := gin.Default()

	router.GET("/add", handler.AddNums)
	router.GET("/subtract", handler.SubtractNums)
	router.GET("/multiply", handler.MultiplyNums)
	router.GET("/divide", handler.DivideNums)

	return router.Run(":" + port)
}
