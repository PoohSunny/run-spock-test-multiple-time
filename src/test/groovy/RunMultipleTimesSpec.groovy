package org.poohsunny

import spock.lang.Specification
import spock.lang.Unroll

class RunMultipleTimesSpec extends Specification {

    @Unroll
    def "#n回目のテスト"() {
        expect:
        println n

        where:
        n << (1..10)
    }
}
