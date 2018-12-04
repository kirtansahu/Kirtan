testing 
<inputVariable>
	<part name="payload" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
			<ns30:ProcessFulfillmentOrderFulfillmentTaskNotificationEBM xmlns:env="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ns30="http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/FulfillmentOrder/V1" xmlns:wsa="http://www.w3.org/2005/08/addressing" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" xmlns="">
						<ns34:EBMHeader xmlns:ns34="http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2">
										<ns34:Sender>
															<ns34:ID>OPS</ns34:ID>
																			</ns34:Sender>
																							<ns34:Target>
																												<ns34:ID>OPS</ns34:ID>
																																</ns34:Target>
																																			</ns34:EBMHeader>
																																						<ns30:DataArea>
																																										<ns30:ProcessFulfillmentOrderFulfillmentTaskNotification>
																																															<ns30:FulfillmentOrderLine>
																																																					<ns30:FulfillmentOrderSchedule>
																																																												<ns34:Identification xmlns:ns34="http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2">
																																																																				<ns34:AlternateObjectKey>
																																																																													<ns34:ID schemeID="FulfillLineId">300001294919572</ns34:ID>
																																																																																					</ns34:AlternateObjectKey>
																																																																																												</ns34:Identification>
																																																																																																			<ns34:Status xmlns:ns34="http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2">
																																																																																																											<ns34:Code>AWAIT_ALLOCATION</ns34:Code>
																																																																																																																		</ns34:Status>
																																																																																																																									<ns30:Custom>
																																																																																																																																	<ns30:FulfillmentOrderScheduleFlex>
																																																																																																																																										<ns18:FulfillLineEffCategories xmlns:ns18="http://xmlns.oracle.com/apps/scm/doo/processOrder/service/">
																																																																																																																																																				<ns6:Category xmlns:ns6="http://xmlns.oracle.com/apps/scm/doo/processOrder/model/">DOO_FULFILL_LINES_ADD_INFO</ns6:Category>
																																																																																																																																																														<ns6:FulfillLineId xmlns:ns6="http://xmlns.oracle.com/apps/scm/doo/processOrder/model/">300001294919572</ns6:FulfillLineId>
																																																																																																																																																																								<ns12:FulfillLineEffBCurrentAllocationprivateVO xmlns:ns12="http://xmlns.oracle.com/apps/scm/doo/processOrder/flex/fulfillLineCategories/">
																																																																																																																																																																																			<ns6:ContextCode xmlns:ns6="http://xmlns.oracle.com/apps/scm/doo/processOrder/model/">CurrentAllocation</ns6:ContextCode>
																																																																																																																																																																																														<ns25:ALAFFNumber xmlns:ns25="http://xmlns.oracle.com/apps/scm/doo/processOrder/flex/fulfillLineContextsB/">276496</ns25:ALAFFNumber>
																																																																																																																																																																																																									<ns25:ALAFFLineNumber xmlns:ns25="http://xmlns.oracle.com/apps/scm/doo/processOrder/flex/fulfillLineContextsB/">038</ns25:ALAFFLineNumber>
																																																																																																																																																																																																																				<ns25:ALAFFSentCount xmlns:ns25="http://xmlns.oracle.com/apps/scm/doo/processOrder/flex/fulfillLineContextsB/">1</ns25:ALAFFSentCount>
																																																																																																																																																																																																																														</ns12:FulfillLineEffBCurrentAllocationprivateVO>
																																																																																																																																																																																																																																							</ns18:FulfillLineEffCategories>
																																																																																																																																																																																																																																															</ns30:FulfillmentOrderScheduleFlex>
																																																																																																																																																																																																																																																						</ns30:Custom>
																																																																																																																																																																																																																																																												</ns30:FulfillmentOrderSchedule>
																																																																																																																																																																																																																																																																	</ns30:FulfillmentOrderLine>
																																																																																																																																																																																																																																																																						<ns30:FulfillmentTaskTypeCode>LogicalAllocation</ns30:FulfillmentTaskTypeCode>
																																																																																																																																																																																																																																																																										</ns30:ProcessFulfillmentOrderFulfillmentTaskNotification>
																																																																																																																																																																																																																																																																													</ns30:DataArea>
																																																																																																																																																																																																																																																																															</ns30:ProcessFulfillmentOrderFulfillmentTaskNotificationEBM>
																																																																																																																																																																																																																																																																																</part>
																																																																																																																																																																																																																																																																																</inputVariable>
