package is.uncommon.cascade;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

  @BindView(R.id.show_native_popup) Button nativePopupButton;
  @BindView(R.id.show_cascade) Button cascadeButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);

    nativePopupButton.setOnClickListener(o -> showNativePopup());
    cascadeButton.setOnClickListener(o -> showCascade());
  }

  private void showNativePopup() {
    PopupMenu menu = new PopupMenu(this, nativePopupButton);
    menu.inflate(R.menu.sample);
    menu.show();
  }

  private void showCascade() {

  }
}
