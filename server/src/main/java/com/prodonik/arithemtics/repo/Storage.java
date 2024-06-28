package com.prodonik.arithemtics.repo;

import org.springframework.stereotype.Component;

import com.prodonik.genprotos.Arith.ArithmeticsResponse;
import com.prodonik.genprotos.Arith.ArithmeticsRequest;;

@Component
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
