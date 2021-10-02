package com.sw.gwt.table.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.sw.gwt.table.client.tableService;

public class tableServiceImpl extends RemoteServiceServlet implements tableService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}