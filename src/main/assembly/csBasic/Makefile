hello: hello.o
	ld -o Sandbox Sandbox.o

hello.o: Sandbox.asm
	nasm -f elf64 -g -F dwarf Sandbox.asm

clean:
	rm -f Sandbox Sandbox.o
