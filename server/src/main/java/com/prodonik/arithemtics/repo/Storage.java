package com.prodonik.arithemtics.repo;

import org.springframework.stereotype.Service;

import com.prodonik.genprotos.IArithmetics.ArithmeticsRequest;
import com.prodonik.genprotos.IArithmetics.ArithmeticsResponse;

@Service
public class Storage {
    public ArithmeticsResponse addNums(ArithmeticsRequest req) {
        return ArithmeticsResponse
                        .newBuilder()
                        .setResult(
                            req.getNum1() + req.getNum2())
                        .build();
    }

    public ArithmeticsResponse subtractNums(ArithmeticsRequest req) {
        return ArithmeticsResponse
                        .newBuilder()
                        .setResult(
                            req.getNum1() - req.getNum2())
                        .build();
    }

    public ArithmeticsResponse multiplyNums(ArithmeticsRequest req) {
        return ArithmeticsResponse
                        .newBuilder()
                        .setResult(
                            req.getNum1() * req.getNum2())
                        .build();
    }

    public ArithmeticsResponse divideNums(ArithmeticsRequest req) throws ArithmeticException {
        double zero = 0.0;
        if (req.getNum2() == zero) {
            throw new ArithmeticException("thero division is not allowed");
        }
        return ArithmeticsResponse
                        .newBuilder()
                        .setResult(
                        req.getNum1() / req.getNum2())
                        .build();
    }
}
