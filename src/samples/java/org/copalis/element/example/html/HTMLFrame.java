/*
 *  Copyright 2012 Giles Burgess
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.copalis.element.example.html;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

/**
 * @author gilesjb
 *
 */
@SuppressWarnings("serial")
public class HTMLFrame extends JFrame {
    
    private final ByteArrayOutputStream bytes = new ByteArrayOutputStream();
    public final PrintStream out = new PrintStream(bytes);
    
    public void display() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        final JEditorPane pane = new JEditorPane();
        pane.addHyperlinkListener(new HyperlinkListener() {
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    try {
                        pane.setPage(e.getURL());
                    } catch (IOException ex) {
                        pane.setText(ex.toString());
                    }
                }
            }
        });
        pane.setEditable(false);
        pane.setContentType("text/html");
        pane.setText(new String(bytes.toByteArray()));
        getContentPane().add(new JScrollPane(pane));
        pack();
        setVisible(true);
    }
    
    public static void main(String[] args) {
        final HTMLFrame frame = new HTMLFrame();
        frame.out.print("<div><ul><li>Hello</li><li>Bye</li></ul></div>");
        frame.display();
    }
}
