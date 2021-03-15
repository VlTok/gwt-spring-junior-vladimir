package com.tokmeninov.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface PersonServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tokmeninov.gwt.client.PersonService
     */
    void list( AsyncCallback<java.util.List<com.tokmeninov.gwt.shared.PersonResp>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tokmeninov.gwt.client.PersonService
     */
    void save( com.tokmeninov.gwt.shared.PersonResp person, AsyncCallback<com.tokmeninov.gwt.shared.PersonResp> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tokmeninov.gwt.client.PersonService
     */
    void delete( com.tokmeninov.gwt.shared.PersonResp person, AsyncCallback<java.lang.Boolean> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static PersonServiceAsync instance;

        public static final PersonServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (PersonServiceAsync) GWT.create( PersonService.class );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instantiated
        }
    }
}
