[![Build Status](https://travis-ci.org/iszlai/productino.svg?branch=master)](https://travis-ci.org/iszlai/productino)
# productino
A library for testing in production

```java
        var exp = new Experiment<Integer>("can add 2+2+2");

        exp.setTrial(() -> 2 + 2 + 2);
        exp.setUse(() -> 2 * 3);

        var res = exp.run();

        assertEquals("addition should equal multiplication", res.trialResult, res.actualResult);
```
