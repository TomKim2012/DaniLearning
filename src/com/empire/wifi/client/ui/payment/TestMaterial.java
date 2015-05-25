package com.empire.wifi.client.ui.payment;

import gwt.material.design.client.ui.MaterialButton;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.user.client.ui.Widget;

public class TestMaterial extends Composite {

	private static TestMaterialUiBinder uiBinder = GWT
			.create(TestMaterialUiBinder.class);
	
	@UiField MaterialButton btnComplete;
	@UiField Element spnServiceLabel;
	@UiField InlineLabel spnBusinessLabel;
	@UiField Element spnBusinessNo;
	
	interface TestMaterialUiBinder extends UiBinder<Widget, TestMaterial> {
	}

	public TestMaterial() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	
	
}
