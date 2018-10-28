package com.noboxz.productino;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExperimentTest {
    @Test
    public void runSuccessfulExperiment() {
        var exp = new Experiment<Integer>("can add 2+2+2");
        exp.setTrial(() -> 2 + 2 + 2);
        exp.setUse(() -> 2 * 3);
        var res = exp.run();
        assertEquals("addition should equal multiplication", res.trialResult, res.actualResult);
    }
}
