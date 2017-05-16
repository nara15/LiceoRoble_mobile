
// https://www.raywenderlich.com/149112/android-fragments-tutorial-introduction
package com.raywenderlich.alltherages;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RageComicListFragment.OnRageComicSelected
{
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    if (savedInstanceState == null)
    {
      getSupportFragmentManager()
              .beginTransaction()
              .add(R.id.root_layout, RageComicListFragment.newInstance(), "rageComicList")
              .commit();
    }
  }
  public void onRageComicSelected(int imageResId, String name, String description, String url)
  {
    Toast.makeText(this, "Selecciona " + name, Toast.LENGTH_SHORT).show();
  }
}
