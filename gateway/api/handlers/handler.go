package handlers

import (
	"log"
	"net/http"
	"strconv"

	"github.com/gin-gonic/gin"
	genprotos "github.com/ruziba3vich/java_and_go_grpc_server_practice/genprotos/protos"
	"google.golang.org/grpc"
)

type (
	handler struct {
		client genprotos.ArithmeticsServiceClient
		logger *log.Logger
	}
)

func New(logger *log.Logger, conn *grpc.ClientConn) *handler {
	return &handler{
		client: genprotos.NewArithmeticsServiceClient(conn),
		logger: logger,
	}
}

func (h *handler) AddNums(c *gin.Context) {
	req, err := extractNum(c)
	if err != nil {
		h.logger.Println(err)
		c.IndentedJSON(http.StatusBadRequest, gin.H{"error 1": err})
		return
	}
	response, err := h.client.Add(c, req)
	if err != nil {
		h.logger.Println(err)
		c.IndentedJSON(http.StatusBadRequest, gin.H{"error 2": err})
		return
	}
	c.IndentedJSON(http.StatusOK, response)
}

func (h *handler) SubtractNums(c *gin.Context) {
	req, err := extractNum(c)
	if err != nil {
		h.logger.Println(err)
		c.IndentedJSON(http.StatusBadRequest, gin.H{"error 3": err})
		return
	}
	response, err := h.client.Subtract(c, req)
	if err != nil {
		h.logger.Println(err)
		c.IndentedJSON(http.StatusBadRequest, gin.H{"error 4": err})
		return
	}
	c.IndentedJSON(http.StatusOK, response)
}

func (h *handler) MultiplyNums(c *gin.Context) {
	req, err := extractNum(c)
	if err != nil {
		h.logger.Println(err)
		c.IndentedJSON(http.StatusBadRequest, gin.H{"error 5": err})
		return
	}
	response, err := h.client.Multiply(c, req)
	if err != nil {
		h.logger.Println(err)
		c.IndentedJSON(http.StatusBadRequest, gin.H{"error 6": err})
		return
	}
	c.IndentedJSON(http.StatusOK, response)
}

func (h *handler) DivideNums(c *gin.Context) {
	req, err := extractNum(c)
	if err != nil {
		h.logger.Println(err)
		c.IndentedJSON(http.StatusBadRequest, gin.H{"error 7": err})
		return
	}
	response, err := h.client.Divide(c, req)
	if err != nil {
		h.logger.Println(err)
		c.IndentedJSON(http.StatusBadRequest, gin.H{"error 8": err})
		return
	}
	c.IndentedJSON(http.StatusOK, response)
}

func extractNum(c *gin.Context) (*genprotos.ArithmeticsRequest, error) {
	num1, err := convertToFloat(c.Query("num1"))
	if err != nil {
		return nil, err
	}
	num2, err := convertToFloat(c.Query("num2"))
	if err != nil {
		return nil, err
	}
	return &genprotos.ArithmeticsRequest{
		Num1: num1,
		Num2: num2,
	}, nil
}

func convertToFloat(str string) (float64, error) {
	num, err := strconv.ParseFloat(str, 64)
	if err != nil {
		return 0, err
	}
	return num, nil
}
