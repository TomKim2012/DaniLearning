package com.empire.wifi.client.place;

import com.empire.wifi.client.place.DefaultPlace;
import com.gwtplatform.mvp.client.proxy.PlaceManagerImpl;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.google.inject.Inject;
import com.google.gwt.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.TokenFormatter;

public class ClientPlaceManager extends PlaceManagerImpl {

	private final PlaceRequest defaultPlaceRequest;

	@Inject
	public ClientPlaceManager(final EventBus eventBus,
			final TokenFormatter tokenFormatter,
			@DefaultPlace final String defaultPlaceNameToken) {
		super(eventBus, tokenFormatter);
		this.defaultPlaceRequest = new PlaceRequest(defaultPlaceNameToken);
	}

	@Override
	public void revealDefaultPlace() {
		revealPlace(defaultPlaceRequest, true);
	}

	@Override
	public void revealErrorPlace(String invalidHistoryToken) {
		super.revealErrorPlace(NameTokens.error);
	}

	@Override
	public void revealUnauthorizedPlace(String unauthorizedHistoryToken) {
		// PlaceRequest place = new PlaceRequest("login").with("redirect",
		// unauthorizedHistoryToken);
		// revealPlace(place, true);

		super.revealUnauthorizedPlace(NameTokens.error);
	}

}
