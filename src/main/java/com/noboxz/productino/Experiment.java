package com.noboxz.productino;

import java.util.Optional;
import java.util.concurrent.Callable;

public class Experiment<R> {
    public final String name;
    public Callable<R> trial;
    public Callable<R> use;

    public void setTrial(Callable<R> trial) {
        this.trial = trial;
    }

    public void setUse(Callable<R> use) {
        this.use = use;
    }

    public Experiment(String name) {
        this.name = name;
    }

    public Result<R> run() {
        Optional<R> trialResult;
        R actual = null;
        Exception trialFailure;
        try {
            trialResult = Optional.ofNullable(trial.call());
        } catch (Exception e) {
            trialFailure = e;
            trialResult = Optional.empty();
        }
        try {
            actual = use.call();
        } catch (Exception e) {

        }
        return new Result<>(trialResult.get(), actual);
    }
}
