package com.prodonik.arithemtics.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.prodonik.arithemtics.repo.Storage;
import com.prodonik.genprotos.Arith.ArithmeticsRequest;
import com.prodonik.genprotos.Arith.ArithmeticsResponse;
import com.prodonik.genprotos.ArithmeticsServiceGrpc;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

@Service
public class ArithmeticsService extends ArithmeticsServiceGrpc.ArithmeticsServiceImplBase {

    private static final Logger logger = LoggerFactory.getLogger(ArithmeticsService.class);

    
    private Storage storage;
    public ArithmeticsService(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void add(ArithmeticsRequest request, StreamObserver<ArithmeticsResponse> response) {
        logger.info("Received request to add service");
        try {
            ArithmeticsResponse resp = storage.addNums(request);
            response.onNext(resp);
            response.onCompleted();
        } catch (Exception e) {
            logger.error("Error processing add request", e);
            response.onError(new StatusRuntimeException(Status.INTERNAL.withDescription(e.getMessage())));
        }
    }

    @Override
    public void subtract(ArithmeticsRequest request, StreamObserver<ArithmeticsResponse> response) {
        logger.info("Received request to subtract service");
        try {
            ArithmeticsResponse resp = storage.subtractNums(request);
            response.onNext(resp);
            response.onCompleted();
        } catch (Exception e) {
            logger.error("Error processing subtract request", e);
            response.onError(new StatusRuntimeException(Status.INTERNAL.withDescription(e.getMessage())));
        }
    }

    @Override
    public void multiply(ArithmeticsRequest request, StreamObserver<ArithmeticsResponse> response) {
        logger.info("Received request to multiply service");
        try {
            ArithmeticsResponse resp = storage.multiplyNums(request);
            response.onNext(resp);
            response.onCompleted();
        } catch (Exception e) {
            logger.error("Error processing multiply request", e);
            response.onError(new StatusRuntimeException(Status.INTERNAL.withDescription(e.getMessage())));
        }
    }

    @Override
    public void divide(ArithmeticsRequest request, StreamObserver<ArithmeticsResponse> response) {
        logger.info("Received request to divide service");
        try {
            ArithmeticsResponse resp = storage.divideNums(request);
            response.onNext(resp);
            response.onCompleted();
        } catch (ArithmeticException e) {
            logger.error("Arithmetic error processing divide request", e);
            response.onError(new StatusRuntimeException(Status.INVALID_ARGUMENT.withDescription(e.getMessage())));
        } catch (Exception e) {
            logger.error("Error processing divide request", e);
            response.onError(new StatusRuntimeException(Status.INTERNAL.withDescription(e.getMessage())));
        }
    }
}
