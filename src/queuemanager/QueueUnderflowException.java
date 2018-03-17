/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;

/**
 *
 * @author marcin7500
 */

/**
 * Queue is empty.
 *
 * Cannot access or remove an item from an empty queue.
 */
public class QueueUnderflowException extends Exception {

    public QueueUnderflowException() {
        super("Queue is empty");
    }
}
