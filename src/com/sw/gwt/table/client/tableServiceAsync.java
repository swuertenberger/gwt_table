package com.sw.gwt.table.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface tableServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
