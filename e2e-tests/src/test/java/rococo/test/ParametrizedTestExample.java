package rococo.test;


import rococo.jupiter.AllureIdParam;
import rococo.jupiter.SpendJsonConverter;
import rococo.model.SpendJson;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametrizedTestExample {


  @CsvSource({
      "1001, Dima",
      "1002, Stas",
      "1003, Artem"
  })
  @ParameterizedTest
  void paramTest(@AllureIdParam String allureId, String name) {

  }


  @ValueSource(strings = {
      "rest/spend0.json", "rest/spend1.json"
  })
  @ParameterizedTest
  void spendRestTest(@ConvertWith(SpendJsonConverter.class) SpendJson spend) {
    System.out.println();
  }
}
