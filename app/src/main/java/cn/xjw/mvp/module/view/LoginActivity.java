package cn.xjw.mvp.module.view;

import android.widget.Button;
import android.widget.EditText;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import cn.xjw.mvp.R;
import cn.xjw.mvp.base.BaseActivity;
import cn.xjw.mvp.base.BaseContract;
import cn.xjw.mvp.di.component.MainComponent;
import cn.xjw.mvp.module.presenter.LoginPresenter;

public class LoginActivity extends BaseActivity {

    @Inject
    LoginPresenter presenter;

    @BindView(R.id.et_name)
    EditText etName;
    @BindView(R.id.et_pswd)
    EditText etPswd;
    @BindView(R.id.btn_submit)
    Button btnSubmit;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_login;
    }

    @Override
    protected void start() {

    }

    @Override
    protected BaseContract.Presenter injectPresenter(MainComponent build) {
        build.inject(this);
        return presenter;
    }

    @OnClick(R.id.btn_submit)
    public void onViewClicked() {
        presenter.login();
    }
}
