package com.sw.gwt.table.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("tableService")
public interface tableService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use tableService.App.getInstance() to access static instance of tableServiceAsync
     */
    public static class App {
        private static tableServiceAsync ourInstance = GWT.create(tableService.class);

        public static synchronized tableServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
