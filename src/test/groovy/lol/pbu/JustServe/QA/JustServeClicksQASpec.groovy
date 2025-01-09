package lol.pbu.JustServe.QA


import geb.spock.GebSpec
import io.micronaut.test.extensions.spock.annotation.MicronautTest

@MicronautTest
class JustServeClicksQASpec extends GebSpec {


    void 'test it works'() {
        when:
        to homePage

        then:
        testPage.profileHeader.clickSignOutButton()
    }


}
