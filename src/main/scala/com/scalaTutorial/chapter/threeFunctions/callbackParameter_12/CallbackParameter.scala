package com.scalaTutorial.chapter.threeFunctions.callbackParameter_12

object CallbackParameter extends App {
    def printReport(sendEmailCallback: () => Unit): Unit = {
        println("Printing report...")
        println("Report printed successfully.")
        sendEmailCallback()
    }

    printReport(() =>
    println("Mail sent.")
    )

    def printReportWithOptionCallback(sendEmailCallback: Option[() => Unit] = None): Unit = {
        println("Printing report ... started")
        println("Printing report ... finished")
        sendEmailCallback.foreach(callback => callback())
    }
    printReportWithOptionCallback(Some(() =>
        println("Sending email wrapped in Some() ... finished")
    ))
}
