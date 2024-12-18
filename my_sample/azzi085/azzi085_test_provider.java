/*
 * Generated using Genero Ghost Client 5.00.02-202405230916
 */
package azzi085;

import com.fourjs.ggc.ScenarioProvider;
import com.fourjs.ggc.Scenario;
import com.fourjs.ggc.Client;
import com.fourjs.ggc.generator.ScenarioChecks;
import java.util.concurrent.ConcurrentLinkedDeque;
import com.fourjs.ggc.DependencyHandler;

public class azzi085_test_provider implements ScenarioProvider
{
  private final ConcurrentLinkedDeque<Scenario> scenarios;
  DependencyHandler dh = null;

  /*  */
  /* Instance initializer */
  public azzi085_test_provider()
  {
    scenarios = new ConcurrentLinkedDeque<>();

    /* Register scenario functions */
    scenarios.add(new scenario_0());

  }

  /* Scenario azzi085_test id: 0 */
  private class scenario_0 implements Scenario
  {
    @Override
    public void play(Client client)
    {
      ScenarioChecks.checkFormName(client, "azzi085.tmp");
      ScenarioChecks.checkFormTitle(client, "資料庫連線設定作業(azzi085)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.mediaSize("large");

      ScenarioChecks.checkFormName(client, "azzi085.tmp");
      ScenarioChecks.checkFormTitle(client, "資料庫連線設定作業(azzi085)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(971);
      client.action("query"); /* 查詢 query */

      ScenarioChecks.checkFormName(client, "azzi085.tmp");
      ScenarioChecks.checkFormTitle(client, "資料庫連線設定作業(azzi085)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(2161);
      client.setFocus("gzda_t.gzda001");

      client.setValue("ds");

      client.action("cancel"); /* 放棄 cancel */

      ScenarioChecks.checkFormName(client, "azzi085.tmp");
      ScenarioChecks.checkFormTitle(client, "資料庫連線設定作業(azzi085)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(1369);
      client.action("query"); /* 查詢 query */

      ScenarioChecks.checkFormName(client, "azzi085.tmp");
      ScenarioChecks.checkFormTitle(client, "資料庫連線設定作業(azzi085)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(1335);
      client.setFocus("gzda_t.gzda001");

      client.setValue("ds");

      client.action("accept"); /* 確定 accept */

      ScenarioChecks.checkFormName(client, "azzi085.tmp");
      ScenarioChecks.checkFormTitle(client, "資料庫連線設定作業(azzi085)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(2467);
      client.action("close"); /* close */

    }
  }

  @Override
  public Scenario nextScenario()
  {
    return scenarios.removeFirst();
  }
}
