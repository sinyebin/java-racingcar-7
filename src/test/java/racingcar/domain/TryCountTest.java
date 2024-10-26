package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TryCountTest {
    @DisplayName("시도횟수가 숫자가 아니거나 0이하일 수 없다.")
    @Test
    public void 시도횟수_에러() {
        assertThatThrownBy(() -> new TryCount("0"))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new TryCount("a"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("시도횟수 차감")
    @Test
    public void 시도횟수_차감() {
        TryCount tryCount = new TryCount(1);
        tryCount.decrease();
        assertThat(tryCount.getTryCount()).isEqualTo(0);
    }


}
