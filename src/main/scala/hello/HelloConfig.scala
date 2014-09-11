package hello

import org.springframework.context.annotation.Configuration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

/**
 * This config class will trigger Spring @annotation scanning and auto configure Spring context.
 *
 * @author saung
 * @since 1.0
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
@RestController
class HelloConfig
 {
 @RequestMapping(value=Array("/"))
def printHello() : String = {
return "hello world"
}

}