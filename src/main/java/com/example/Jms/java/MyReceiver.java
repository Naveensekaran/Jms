// package com.example.Jms.java;

// import javax.jms.Connection;
// import javax.jms.ConnectionFactory;
// import javax.jms.JMSException;
// import javax.jms.Message;
// import javax.jms.MessageConsumer;
// import javax.jms.Queue;
// import javax.jms.Session;
// import javax.jms.TextMessage;

// import org.apache.activemq.ActiveMQConnection;
// import org.apache.activemq.ActiveMQConnectionFactory;

// // Receive message from Queue using java

// public class MyReceiver {
    
//     private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;

//     private static String queueName = "MESSAGE_QUEUE";

//     public static void main(String[] args) throws JMSException {
//         System.out.println("url " + url);

//          ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
//          Connection connection = connectionFactory.createConnection();
//          connection.start();

//          Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE );

//          Queue destination = session.createQueue(queueName);

//          MessageConsumer consumer = session.createConsumer(destination);

//          Message message = consumer.receive();

//          if(message instanceof TextMessage){
//             TextMessage textMessage = (TextMessage) message;
//             System.out.println("Received message '" + textMessage.getText() + " '");
//          }

//          connection.close();

//     }
// }
