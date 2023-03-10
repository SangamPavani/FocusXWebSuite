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

Func _WinWaitActivate($title,$text,$timeout=0)
	WinWait($title,$text,$timeout)
	If Not WinActive($title,$text) Then WinActivate($title,$text)
	WinWaitActive($title,$text,$timeout)
EndFunc

#comments-start
_AU3RecordSetup()
#endregion --- Internal functions Au3Recorder End ---
#comments-end

#comments-start
_WinWaitActivate("Focus-Ledger - Google Chrome","")
#comments-end
MouseClick("left",985,332,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(980,450)
Sleep(5000)
MouseUp("left")
Sleep(2000)
MouseClick("left",989,350,1)
Sleep(2000)
MouseDown("left")
Sleep(5000)
MouseMove(1194,542)
Sleep(2000)
MouseUp("left")
Sleep(5000)
MouseClick("left",994,367,1)
Sleep(2000)
MouseDown("left")
Sleep(4000)
MouseMove(1184,571)
Sleep(2000)
MouseUp("left")
Sleep(2000)
#comments-start
#endregion --- Au3Recorder generated code End ---
#comments-end