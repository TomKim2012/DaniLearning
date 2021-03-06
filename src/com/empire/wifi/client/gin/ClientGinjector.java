package com.empire.wifi.client.gin;

import com.empire.wifi.client.ui.MainPagePresenter;
import com.empire.wifi.client.ui.home.HomePresenter;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.inject.client.AsyncProvider;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import com.gwtplatform.mvp.client.proxy.PlaceManager;

@GinModules({ DispatchAsyncModule.class, ClientModule.class })
public interface ClientGinjector extends Ginjector {

	EventBus getEventBus();

	PlaceManager getPlaceManager();
	
	AsyncProvider<HomePresenter> getHomePresenter();
	
	AsyncProvider<MainPagePresenter> getMainPagePresenter();

}
