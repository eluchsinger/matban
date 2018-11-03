package ch.zurich.k5.matban

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MatbanApplication

fun main(args: Array<String>) {
    runApplication<MatbanApplication>(*args)
}
