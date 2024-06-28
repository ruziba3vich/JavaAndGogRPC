package com.prodonik.arithemtics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodonik.arithemtics.repo.Storage;
import com.prodonik.genprotos.ArithmeticsServiceGrpc.ArithmeticsServiceImplBase;
import com.prodonik.genprotos.IArithmetics.ArithmeticsRequest;
import com.prodonik.genprotos.IArithmetics.ArithmeticsResponse;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

@Service
public class ArithService extends ArithmeticsServiceImplBase {
    @Autowired
    private Storage storage;
    // public ArithService(Storage storage) {
    //     this.storage = storage;
    // }
    @Override
    public void add(ArithmeticsRequest request, StreamObserver<ArithmeticsResponse> response) {
            response.onNext(this.storage.addNums(request));
            response.onCompleted();
    }

    @Override
    public void subtract(ArithmeticsRequest request, StreamObserver<ArithmeticsResponse> response) {
        response.onNext(this.storage.subtractNums(request));
        response.onCompleted();
    }

    @Override
    public void multiply(ArithmeticsRequest request, StreamObserver<ArithmeticsResponse> response) {
        response.onNext(this.storage.multiplyNums(request));
        response.onCompleted();
    }

    @Override
    public void divide(ArithmeticsRequest request, StreamObserver<ArithmeticsResponse> response) {
        try {
            response.onNext(this.storage.divideNums(request));
            response.onCompleted();
        } catch (ArithmeticException e) {
            response.onError(new StatusRuntimeException(Status.INVALID_ARGUMENT.withDescription(e.getMessage())));
        } catch (Exception e) {
            response.onError(new StatusRuntimeException(Status.INVALID_ARGUMENT.withDescription(e.getMessage())));
        }
    }
}
