package com.example

// These libraries provide the core foundation needed to create an ActorSystem and Actors
import akka.actor.Actor 
import akka.actor.ActorSystem
import akka.actor.Props



class AkkaHelloWorld extends Actor {
  def receive = {
    case msg:String => println("Hey! Got your message: "+ msg)
    case _ => println("Invalid message")
  }
}


object Main extends App{
    val hwActorSystem = ActorSystem("hwActorSystem")
    val hwActor = hwActorSystem.actorOf(Props[AkkaHelloWorld], name = "hwActor")
    hwActor ! "Saying Hello to you, Actor!!"
}


