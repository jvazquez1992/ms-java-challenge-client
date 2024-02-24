package com.devsu.challenge.msjavachallengeclient.controller;

import com.devsu.challenge.msjavachallengeclient.models.GetClientResponse;
import com.devsu.challenge.msjavachallengeclient.server.ClienteApi;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ClienteController implements ClienteApi {

    @Override
    public ResponseEntity<GetClientResponse> getClient(String personIdentification) throws Exception {
        GetClientResponse getClientResponse = new GetClientResponse();
        getClientResponse.setNames("MyNames");
        return ResponseEntity.ok(getClientResponse);
    }
}
