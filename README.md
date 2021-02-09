# NiceDialog

## 依赖

```groovy
implementation "me.simple:nice-dialog:1.0.0"
```

## NiceDialog

| 方法名            | 作用                         |
| :---------------- | ---------------------------- |
| setWidth          | 设置宽                       |
| setHeight         | 设置高                       |
| setDimAmount      | 设置背景颜色比例（0-1f）     |
| setGravity        | 设置弹出位置                 |
| setAnimRes        | 设置出入动画                 |
| autoShowSoftInput | 是否自动显示软键盘           |

## NiceBottomDialog

默认从底部渐入渐出弹出，宽度为`MATCH_PARENT`

## NiceFullScreenDialog

| 方法名    | 作用              |
| --------- | ----------------- |
| isHideBar | 是否填充StatusBar |

## NiceDialogFragment系列

使用方法同上

## Bug反馈Q群：1078185041

<img src="files/q_group.jpg" width="270px" height="370px">

## 版本迭代

* v1.0.1：新增`DialogFragment`系列，去掉`setLayoutRes`等抽象方法

* v1.0.0：首次上传