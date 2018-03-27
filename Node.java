/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;

/**
 *
 * @author hp marcin
 */
class Node {
 Node next = null;
    int priority;
    String name;

    public Node(int d, String a){
    	this.priority = d;
        this.name = a;
    }

    Node(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}