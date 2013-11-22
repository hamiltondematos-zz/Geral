/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endpoint;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author hamilton.matos
 */
@ServerEndpoint(value = "/sala")
public class SalaEndpoint {

    private static final Set<Session> sessoes = Collections.synchronizedSet(new HashSet<Session>());

    @OnClose
    public void onClose(Session s) {
        sessoes.remove(s);
    }

    @OnOpen
    public void onOpen(Session s) {
        sessoes.add(s);
    }

    @OnMessage
    public void onMessage(String mensagem, Session s) throws IOException {
        for (Session session : sessoes) {
            session.getBasicRemote().sendText(mensagem);
        }
    }

}
