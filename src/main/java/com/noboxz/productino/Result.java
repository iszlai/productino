package com.noboxz.productino;

public class Result<R> {
    R trialResult;
    R actualResult;

    public Result(R trialResult, R actualResult) {
        this.trialResult = trialResult;
        this.actualResult = actualResult;
    }

    public R getTrialResult() {
        return trialResult;
    }


    public R getActualResult() {
        return actualResult;
    }

}
