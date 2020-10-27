package com.martinetherton.ons

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class OnsApplication {

}

object OnsApplication {
  def main(args: Array[String]): Unit = SpringApplication.run(classOf[OnsApplicationJava], args: _*)
}