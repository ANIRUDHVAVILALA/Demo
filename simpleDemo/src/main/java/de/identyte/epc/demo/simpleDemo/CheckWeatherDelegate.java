/*************************************************************************
 *
 * IDENTYTEC GmbH & Co.KG CONFIDENTIAL
 * __________________
 *
 *  [2018] - [2020] IDENTYTEC GmbH & Co.KG
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of IDENTYTEC GmbH & Co.KG. The intellectual and technical concepts contained
 * herein are proprietary to IDENTYTEC GmbH & Co.KG
 * and its suppliers and may be covered by Europe and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from IDENTYTEC GmbH & Co.KG.
 */

package de.identyte.epc.demo.simpleDemo;

import java.util.Random;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CheckWeatherDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		Random rando  = new Random();
		
		execution.setVariable("name", "Naveen");
		execution.setVariable("weather", rando.nextBoolean());
	}

}
