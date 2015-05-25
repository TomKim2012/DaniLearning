package com.empire.wifi.client.gin;

import com.empire.wifi.client.place.ClientPlaceManager;
import com.empire.wifi.client.place.DefaultPlace;
import com.empire.wifi.client.place.NameTokens;
import com.empire.wifi.client.ui.MainPagePresenter;
import com.empire.wifi.client.ui.MainPageView;
import com.empire.wifi.client.ui.error.ErrorPresenter;
import com.empire.wifi.client.ui.error.ErrorView;
import com.empire.wifi.client.ui.home.HomePresenter;
import com.empire.wifi.client.ui.home.HomeView;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(ClientPlaceManager.class));

		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.home);
		
		bindPresenter(MainPagePresenter.class, MainPagePresenter.MyView.class,
				MainPageView.class, MainPagePresenter.MyProxy.class);

		bindPresenter(HomePresenter.class, HomePresenter.MyView.class,
				HomeView.class, HomePresenter.MyProxy.class);
		
		bindPresenterWidget(ErrorPresenter.class, ErrorPresenter.MyView.class,
				ErrorView.class);
		
	}
}
