package com.dom.po.parser;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class TraverseDoc {
	public void printNode(Node node) {
		if (node.getNodeType() == Node.DOCUMENT_NODE) {
			printNode(node.getFirstChild());
		} else if (node.getNodeType() == Node.ELEMENT_NODE) {
			System.out.print("<" + node.getNodeName() + ">");
			NodeList children = node.getChildNodes();
			for (int i = 0; i < children.getLength(); i++) {
				Node child = children.item(i);
				printNode(child);
			}
			System.out.println("</" + node.getNodeName() + ">");
		} else if (node.getNodeType() == Node.TEXT_NODE) {
			System.out.print(node.getNodeValue());
		}
	}
}
