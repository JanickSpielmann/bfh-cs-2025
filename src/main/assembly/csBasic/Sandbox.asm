SECTION .data           	; Section containing initialised data

Msg db "Hello world!", 10 	; Message with the String that should be printet and lineending
MsgLen: equ $ - Msg 		; length

SECTION .bss            	; Section containing uninitialized data

SECTION .text           	; Section containing code

global _start           	; Linker needs this to find the entry point!

_start:

	mov rax, 1		; Code for Sys_write call
	mov rdi, 1		; Standard output
	mov rsi, Msg		; Offset and Message
	mov rdx, MsgLen		; Message length as calculated in .data
	syscall			; Make call
    	mov rax, 60         	; Code for exit
    	mov rdi, 0          	; Return a code of zero
    	syscallAQDWsADWAQD             	; Make kernel call
