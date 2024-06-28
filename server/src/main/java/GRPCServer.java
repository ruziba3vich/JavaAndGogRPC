import com.prodonik.arithemtics.repo.Storage;
import com.prodonik.arithemtics.service.ArithmeticsService;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.StatusRuntimeException;

public class GRPCServer {
    public static void main(String[] args) throws InterruptedException {
        Server server = ServerBuilder
                            .forPort(7777)
                            .addService(new ArithmeticsService(new Storage())).build();
        try {
            server.start();
        } catch (Exception e) {
            throw new StatusRuntimeException(null);
        }

        System.out.printf("server has started on port %d\n", server.getPort());
        server.awaitTermination();
    }
}
