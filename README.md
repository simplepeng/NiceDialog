# NiceDialog

## 依赖

```groovy
implementation "me.simple:nice-dialog:1.0.0"
```

## NiceDialog

| 方法名            | 作用                         |
| :---------------- | ---------------------------- |
| setLayoutRes      | 设置布局文件                 |
| setWidth          | 设置宽                       |
| setHeight         | 设置高                       |
| setDimAmount      | 设置背景颜色比例（0-1f）     |
| setGravity        | 设置弹出位置                 |
| setAnimRes        | 设置出入动画                 |
| onCreateBefore    | 会在`setContentView`之前调用 |
| onCreateAfter     | 会在`setContentView`之后调用 |
| autoShowSoftInput | 是否自动显示软键盘           |

## NiceBottomDialog

默认从底部渐入渐出弹出，宽度`MATCH_PARENT`

## NiceFullScreenDialog

| 方法名    | 作用              |
| --------- | ----------------- |
| isHideBar | 是否填充StatusBar |

## 技术支持Q群：1078185041

<img src="files/q_group.jpg" width="270px" height="370px">