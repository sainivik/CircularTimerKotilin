# CircularTimerKotilin
Circular timer in kotlin
### Screenshot
<img src="https://github.com/sainivik/CircularTimerKotilin/blob/master/app/screenshots/circularview.gif.gif" width="300px" height="632px"/>

#### Usage

Add the following code to your view

```xml
 <com.whide.partner.utils.circularTimer.CircularTimerView
                android:id="@+id/progressCircular"
                android:layout_width="250dp"
                android:layout_height="250dp"
                app:backgroundColor="@color/white"
                app:backgroundWidth="8"
                app:maxValue="100"
                app:prefix=""
                app:progressBackgroundColor="@color/color_a1c5d5"
                app:progressColor="@color/white"
                app:progressText=""
                app:progressTextColor="#000000"
                app:startingPoint="top"
                app:suffix=""
                app:textSize="18sp" />
```

 the following code you can listen to onFinish or onTick timer

```java
 binding.progressCircular.setCircularTimerListener(object : CircularTimerListener {
            override fun updateDataOnTick(remainingTimeInMs: Long): String {

                return Math.ceil((remainingTimeInMs / 1000f).toDouble()).toString()
            }

            override fun onTimerFinished() {
                Toast.makeText(this@MainActivity, "time is over", Toast.LENGTH_LONG).show()


            }
        }, 50, TimeFormatEnum.SECONDS, 10)
```


## Author

Vikas Saini

email: vikaskumarsaini0001@gmail.com

github: https://github.com/sainivik

