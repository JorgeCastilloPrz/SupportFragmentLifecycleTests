# Test fragment callbacks

I needed to fix a bug at work so I created this project. It's basically a test about which fragment callbacks are called and in what order when you replace it and add the fragment to the backstack using the support fragment manager API. I know, there are some cool lifecycle diagrams out there, but still.

## Test results
Methods called on `MainFragment` when being replaced and added to the backstack:
* `onPause()`
* `onStop()`
* `onDestroyView()`

So `onDestroy()` and `onDetach()` are **not** called.
