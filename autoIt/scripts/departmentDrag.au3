#comments-start
#region --- Au3Recorder generated code Start (v3.3.9.5 KeyboardLayout=00000409)  ---

#region --- Internal functions Au3Recorder Start ---
Func _Au3RecordSetup()
Opt('WinWaitDelay',100)
Opt('WinDetectHiddenText',1)
Opt('MouseCoordMode',0)
Local $aResult = DllCall('User32.dll', 'int', 'GetKeyboardLayoutNameW', 'wstr', '')
If $aResult[1] <> '00000409' Then
  MsgBox(64, 'Warning', 'Recording has been done under a different Keyboard layout' & @CRLF & '(00000409->' & $aResult[1] & ')')
EndIf

EndFunc

#comments-end

#comments-start
_WinWaitActivate("Focus-Report Designer - Google Chrome","")
#comments-end
MouseClick("left",232,560,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(495,431)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",841,654,1)
Sleep(2000)
#comments-start
#endregion --- Au3Recorder generated code End ---
#comments-end
