package com.vroozi.api.service;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.vroozi.api.conf.AppConfig;
import com.vroozi.api.model.ChartOfAccount;
import com.vroozi.api.services.ChartOfAccountService;

/**
 * 
 * @author anishmanandhar<anishmanandhar@lftechnology.com>
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
@WebAppConfiguration
public class ChartOfAccountServiceTest {

  @Autowired
  private ChartOfAccountService chartOfAccountService;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {}

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void testAddNew() {
    // given
    ChartOfAccount chartOfAccount = new ChartOfAccount();
    chartOfAccount.setName("chart of account name");
    chartOfAccount.setDescription("Description");
    chartOfAccount.setDateCreated(new Date());
    chartOfAccount.setDeleted(true);
    chartOfAccount.setUnitId("UnitId-123");
    chartOfAccount.setActive(true);
    // when
    ChartOfAccount resultChartOfAccount = this.chartOfAccountService.addNew(chartOfAccount);

    // then
    assertEquals(resultChartOfAccount.getUnitId(), "UnitId-123");
  }

}
