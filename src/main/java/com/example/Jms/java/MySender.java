// package com.example.Jms.java;
// import javax.jms.*;

// import org.apache.activemq.ActiveMQConnection;
// import org.apache.activemq.ActiveMQConnectionFactory;

// // Send messages to a Queue using java 

// public class MySender {
    
//     private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;

//     private static String queueName = "MESSAGE_QUEUE";

//     public static void main(String[] args) throws JMSException {
//         System.out.println("url : " + url);

//         ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
//         Connection connection = connectionFactory.createConnection();
//         connection.start();

//         Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE );
        
//         Queue destination = session.createQueue(queueName);

//         MessageProducer producer = session.createProducer(destination);

//         TextMessage message = session.createTextMessage("Hi Naveen, How are you...?");

//         producer.send(message);

//         System.out.println("Message " + message.getText() + ", Sent Successfully to the Queue");
//         connection.close();
//     }
// }
