package com.chehui.maiche;

import java.util.Stack;

import android.content.Intent;

import com.chehui.maiche.login.LoginActivity;
import com.chehui.maiche.utils.LogN;

/**
 * 管理所有Activity 当启动一个Activity时，就将其保存到Stack中， 退出时，从Stack中删除
 * 
 * @version
 * @date
 */
public class ActivityManager {
	/**
	 * 保存所有Activity
	 */
	private volatile Stack<BaseActivity> activityStack = new Stack<BaseActivity>();

	private static volatile ActivityManager instance;

	private ActivityManager() {

	}

	/**
	 * 创建单例类，提供静态方法调用
	 * 
	 * @return ActivityManager
	 */
	public static ActivityManager getInstance() {
		if (instance == null) {
			instance = new ActivityManager();
		}
		return instance;
	}

	public void logout(LogoutReason logoutReason) {
		if (null == logoutReason) {
			logoutReason = LogoutReason.NORMAL;
		}

		Intent intent = new Intent();
		intent.putExtra("logout_reason", logoutReason);
		// startNextActivity(intent, LoginActivity.class);
		popOtherActivity(LoginActivity.class);

		// SharedPreManager.getInstance().setString(SharedPreManager.USER_PWD,
		// "");
		// LoginManager.getInstance().logout();

	}

	/**
	 * 退出Activity
	 * 
	 * @param activity
	 *            BaseActivity
	 */
	public void popActivity(BaseActivity activity) {
		if (activity != null) {
			LogN.d(this, "popActivity: " + activity.getLocalClassName());
			activityStack.remove(activity);
		}
	}

	/**
	 * 获得当前栈顶的Activity
	 * 
	 * @return BaseActivity BaseActivity
	 */
	public BaseActivity currentActivity() {
		BaseActivity activity = null;
		if (!activityStack.empty()) {
			activity = activityStack.lastElement();
		}
		return activity;
	}

	/**
	 * 将当前Activity推入栈中
	 * 
	 * @param activity
	 *            BaseActivity
	 */
	public void pushActivity(BaseActivity activity) {
		LogN.d(this, "pushActivity: " + activity.getLocalClassName());
		activityStack.add(activity);
	}

	/**
	 * 退出栈中其他所有Activity
	 * 
	 * @param cls
	 *            Class 类名
	 */
	public void popOtherActivity(Class<? extends BaseActivity> cls) {
		if (null == cls) {
			LogN.e(this, "class is null");
			return;
		}

		for (BaseActivity activity : activityStack) {
			if (null == activity || activity.getClass().equals(cls)) {
				continue;
			}

			activity.finish();
		}
		LogN.d(this, "BaseActivity num is : " + activityStack.size());
	}

	/**
	 * 退出栈中所有Activity
	 * 
	 */
	public void popAllActivity() {
		while (true) {
			BaseActivity activity = currentActivity();
			if (activity == null) {
				break;
			}
			activity.finish();
			popActivity(activity);
		}
		LogN.d(this, "BaseActivity num is : " + activityStack.size());
	}

	/**
	 * 
	 * 添加统一跳转接口，统一界面跳转动画
	 * 
	 * @param intent
	 * @param requestCode
	 */
	public void startActivityForResult(Intent intent, int requestCode, Class<? extends BaseActivity> activityClass) {
		BaseActivity curActivity = currentActivity();

		if (null == intent) {
			intent = new Intent();
		}

		intent.setClass(curActivity, activityClass);
		curActivity.startActivityForResult(intent, requestCode);
		curActivity.overridePendingTransition(R.anim.push_right_in, R.anim.push_left_out);
	}

	/**
	 * 添加统一跳转接口，统一界面跳转动画
	 * 
	 * @param activityClass
	 *            要跳转的activity的calss
	 */
	public void startNextActivity(Class<? extends BaseActivity> activityClass) {
		Intent intent = new Intent();
		startNextActivity(intent, activityClass);
	}

	/**
	 * 添加统一跳转接口，统一界面跳转动画
	 * 
	 * @param intent
	 *            页面定义的Intent
	 * @param activityClass
	 *            要跳转的activity的calss
	 */
	public void startNextActivity(Intent intent, Class<? extends BaseActivity> activityClass) {
		BaseActivity curActivity = currentActivity();
		intent.setClass(curActivity, activityClass);
		curActivity.startActivity(intent);
		curActivity.overridePendingTransition(R.anim.push_right_in, R.anim.push_left_out);
	}

	public enum LogoutReason {
		NORMAL, EXIT_BY_USER, EXIT_LOGIN_BY_OTHER
	}
}
