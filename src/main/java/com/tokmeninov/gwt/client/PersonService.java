package com.tokmeninov.gwt.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.tokmeninov.gwt.shared.PersonResp;

import java.util.List;

@RemoteServiceRelativePath("rpc/person")
public interface PersonService extends RemoteService {
    List<PersonResp> list();

    PersonResp save(PersonResp person);

    boolean delete(PersonResp person);
}
