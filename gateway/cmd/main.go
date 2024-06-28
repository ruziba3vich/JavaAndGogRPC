package main

import (
	"log"
	"os"

	"github.com/ruziba3vich/java_and_go_grpc_server_practice/api"
)

func main() {
	api := api.New(log.New(os.Stdout, "INFO: ", log.Ldate|log.Ltime|log.Lshortfile))
	log.Fatal(api.RUN("8888"))
}
