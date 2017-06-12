// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LCPacket.proto

package com.game.lll.protobuf;

public final class LCPacket {
	private LCPacket() {}
	public static void registerAllExtensions(
			com.google.protobuf.ExtensionRegistry registry) {
	}
	public interface LoginOrBuilder extends
	// @@protoc_insertion_point(interface_extends:Packets.Login)
	com.google.protobuf.MessageOrBuilder {

		/**
		 * <code>required string username = 1;</code>
		 */
		boolean hasUsername();
		/**
		 * <code>required string username = 1;</code>
		 */
		String getUsername();
		/**
		 * <code>required string username = 1;</code>
		 */
		com.google.protobuf.ByteString
		getUsernameBytes();

		/**
		 * <code>required string password = 2;</code>
		 */
		boolean hasPassword();
		/**
		 * <code>required string password = 2;</code>
		 */
		String getPassword();
		/**
		 * <code>required string password = 2;</code>
		 */
		com.google.protobuf.ByteString
		getPasswordBytes();
	}
	/**
	 * Protobuf type {@code Packets.Login}
	 */
	public static final class Login extends
	com.google.protobuf.GeneratedMessage implements
	// @@protoc_insertion_point(message_implements:Packets.Login)
	LoginOrBuilder {
		// Use Login.newBuilder() to construct.
		private Login(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
			super(builder);
			this.unknownFields = builder.getUnknownFields();
		}
		private Login(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

		private static final Login defaultInstance;
		public static Login getDefaultInstance() {
			return defaultInstance;
		}

		public Login getDefaultInstanceForType() {
			return defaultInstance;
		}

		private final com.google.protobuf.UnknownFieldSet unknownFields;
		@Override
		public final com.google.protobuf.UnknownFieldSet
		getUnknownFields() {
			return this.unknownFields;
		}
		private Login(
				com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
						throws com.google.protobuf.InvalidProtocolBufferException {
			initFields();
			int mutable_bitField0_ = 0;
			com.google.protobuf.UnknownFieldSet.Builder unknownFields =
					com.google.protobuf.UnknownFieldSet.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!parseUnknownField(input, unknownFields,
								extensionRegistry, tag)) {
							done = true;
						}
						break;
					}
					case 10: {
						com.google.protobuf.ByteString bs = input.readBytes();
						bitField0_ |= 0x00000001;
						username_ = bs;
						break;
					}
					case 18: {
						com.google.protobuf.ByteString bs = input.readBytes();
						bitField0_ |= 0x00000002;
						password_ = bs;
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(
						e.getMessage()).setUnfinishedMessage(this);
			} finally {
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}
		public static final com.google.protobuf.Descriptors.Descriptor
		getDescriptor() {
			return LCPacket.internal_static_Packets_Login_descriptor;
		}

		protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
		internalGetFieldAccessorTable() {
			return LCPacket.internal_static_Packets_Login_fieldAccessorTable
					.ensureFieldAccessorsInitialized(
							Login.class, Builder.class);
		}

		public static com.google.protobuf.Parser<Login> PARSER =
				new com.google.protobuf.AbstractParser<Login>() {
			public Login parsePartialFrom(
					com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
							throws com.google.protobuf.InvalidProtocolBufferException {
				return new Login(input, extensionRegistry);
			}
		};

		@Override
		public com.google.protobuf.Parser<Login> getParserForType() {
			return PARSER;
		}

		private int bitField0_;
		public static final int USERNAME_FIELD_NUMBER = 1;
		private Object username_;
		/**
		 * <code>required string username = 1;</code>
		 */
		 public boolean hasUsername() {
			 return ((bitField0_ & 0x00000001) == 0x00000001);
		 }
		 /**
		  * <code>required string username = 1;</code>
		  */
		  public String getUsername() {
			  Object ref = username_;
			  if (ref instanceof String) {
				  return (String) ref;
			  } else {
				  com.google.protobuf.ByteString bs = 
						  (com.google.protobuf.ByteString) ref;
				  String s = bs.toStringUtf8();
				  if (bs.isValidUtf8()) {
					  username_ = s;
				  }
				  return s;
			  }
		  }
		  /**
		   * <code>required string username = 1;</code>
		   */
		  public com.google.protobuf.ByteString
		  getUsernameBytes() {
			  Object ref = username_;
			  if (ref instanceof String) {
				  com.google.protobuf.ByteString b = 
						  com.google.protobuf.ByteString.copyFromUtf8(
								  (String) ref);
				  username_ = b;
				  return b;
			  } else {
				  return (com.google.protobuf.ByteString) ref;
			  }
		  }

		  public static final int PASSWORD_FIELD_NUMBER = 2;
		  private Object password_;
		  /**
		   * <code>required string password = 2;</code>
		   */
		  public boolean hasPassword() {
			  return ((bitField0_ & 0x00000002) == 0x00000002);
		  }
		  /**
		   * <code>required string password = 2;</code>
		   */
		  public String getPassword() {
			  Object ref = password_;
			  if (ref instanceof String) {
				  return (String) ref;
			  } else {
				  com.google.protobuf.ByteString bs = 
						  (com.google.protobuf.ByteString) ref;
				  String s = bs.toStringUtf8();
				  if (bs.isValidUtf8()) {
					  password_ = s;
				  }
				  return s;
			  }
		  }
		  /**
		   * <code>required string password = 2;</code>
		   */
		  public com.google.protobuf.ByteString
		  getPasswordBytes() {
			  Object ref = password_;
			  if (ref instanceof String) {
				  com.google.protobuf.ByteString b = 
						  com.google.protobuf.ByteString.copyFromUtf8(
								  (String) ref);
				  password_ = b;
				  return b;
			  } else {
				  return (com.google.protobuf.ByteString) ref;
			  }
		  }

		  private void initFields() {
			  username_ = "";
			  password_ = "";
		  }
		  private byte memoizedIsInitialized = -1;
		  public final boolean isInitialized() {
			  byte isInitialized = memoizedIsInitialized;
			  if (isInitialized == 1) return true;
			  if (isInitialized == 0) return false;

			  if (!hasUsername()) {
				  memoizedIsInitialized = 0;
				  return false;
			  }
			  if (!hasPassword()) {
				  memoizedIsInitialized = 0;
				  return false;
			  }
			  memoizedIsInitialized = 1;
			  return true;
		  }

		  public void writeTo(com.google.protobuf.CodedOutputStream output)
				  throws java.io.IOException {
			  getSerializedSize();
			  if (((bitField0_ & 0x00000001) == 0x00000001)) {
				  output.writeBytes(1, getUsernameBytes());
			  }
			  if (((bitField0_ & 0x00000002) == 0x00000002)) {
				  output.writeBytes(2, getPasswordBytes());
			  }
			  getUnknownFields().writeTo(output);
		  }

		  private int memoizedSerializedSize = -1;
		  public int getSerializedSize() {
			  int size = memoizedSerializedSize;
			  if (size != -1) return size;

			  size = 0;
			  if (((bitField0_ & 0x00000001) == 0x00000001)) {
				  size += com.google.protobuf.CodedOutputStream
						  .computeBytesSize(1, getUsernameBytes());
			  }
			  if (((bitField0_ & 0x00000002) == 0x00000002)) {
				  size += com.google.protobuf.CodedOutputStream
						  .computeBytesSize(2, getPasswordBytes());
			  }
			  size += getUnknownFields().getSerializedSize();
			  memoizedSerializedSize = size;
			  return size;
		  }

		  private static final long serialVersionUID = 0L;
		  @Override
		  protected Object writeReplace()
				  throws java.io.ObjectStreamException {
			  return super.writeReplace();
		  }

		  public static Login parseFrom(
				  com.google.protobuf.ByteString data)
						  throws com.google.protobuf.InvalidProtocolBufferException {
			  return PARSER.parseFrom(data);
		  }
		  public static Login parseFrom(
				  com.google.protobuf.ByteString data,
				  com.google.protobuf.ExtensionRegistryLite extensionRegistry)
						  throws com.google.protobuf.InvalidProtocolBufferException {
			  return PARSER.parseFrom(data, extensionRegistry);
		  }
		  public static Login parseFrom(byte[] data)
				  throws com.google.protobuf.InvalidProtocolBufferException {
			  return PARSER.parseFrom(data);
		  }
		  public static Login parseFrom(
				  byte[] data,
				  com.google.protobuf.ExtensionRegistryLite extensionRegistry)
						  throws com.google.protobuf.InvalidProtocolBufferException {
			  return PARSER.parseFrom(data, extensionRegistry);
		  }
		  public static Login parseFrom(java.io.InputStream input)
				  throws java.io.IOException {
			  return PARSER.parseFrom(input);
		  }
		  public static Login parseFrom(
				  java.io.InputStream input,
				  com.google.protobuf.ExtensionRegistryLite extensionRegistry)
						  throws java.io.IOException {
			  return PARSER.parseFrom(input, extensionRegistry);
		  }
		  public static Login parseDelimitedFrom(java.io.InputStream input)
				  throws java.io.IOException {
			  return PARSER.parseDelimitedFrom(input);
		  }
		  public static Login parseDelimitedFrom(
				  java.io.InputStream input,
				  com.google.protobuf.ExtensionRegistryLite extensionRegistry)
						  throws java.io.IOException {
			  return PARSER.parseDelimitedFrom(input, extensionRegistry);
		  }
		  public static Login parseFrom(
				  com.google.protobuf.CodedInputStream input)
						  throws java.io.IOException {
			  return PARSER.parseFrom(input);
		  }
		  public static Login parseFrom(
				  com.google.protobuf.CodedInputStream input,
				  com.google.protobuf.ExtensionRegistryLite extensionRegistry)
						  throws java.io.IOException {
			  return PARSER.parseFrom(input, extensionRegistry);
		  }

		  public static Builder newBuilder() { return Builder.create(); }
		  public Builder newBuilderForType() { return newBuilder(); }
		  public static Builder newBuilder(Login prototype) {
			  return newBuilder().mergeFrom(prototype);
		  }
		  public Builder toBuilder() { return newBuilder(this); }

		  @Override
		  protected Builder newBuilderForType(
				  com.google.protobuf.GeneratedMessage.BuilderParent parent) {
			  Builder builder = new Builder(parent);
			  return builder;
		  }
		  /**
		   * Protobuf type {@code Packets.Login}
		   */
		   public static final class Builder extends
		   com.google.protobuf.GeneratedMessage.Builder<Builder> implements
		   // @@protoc_insertion_point(builder_implements:Packets.Login)
		   LoginOrBuilder {
			   public static final com.google.protobuf.Descriptors.Descriptor
			   getDescriptor() {
				   return LCPacket.internal_static_Packets_Login_descriptor;
			   }

			   protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
			   internalGetFieldAccessorTable() {
				   return LCPacket.internal_static_Packets_Login_fieldAccessorTable
						   .ensureFieldAccessorsInitialized(
								   Login.class, Builder.class);
			   }

			   // Construct using com.game.lll.protobuf.LCPacket.Login.newBuilder()
			   private Builder() {
				   maybeForceBuilderInitialization();
			   }

			   private Builder(
					   com.google.protobuf.GeneratedMessage.BuilderParent parent) {
				   super(parent);
				   maybeForceBuilderInitialization();
			   }
			   private void maybeForceBuilderInitialization() {
				   if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
				   }
			   }
			   private static Builder create() {
				   return new Builder();
			   }

			   public Builder clear() {
				   super.clear();
				   username_ = "";
				   bitField0_ = (bitField0_ & ~0x00000001);
				   password_ = "";
				   bitField0_ = (bitField0_ & ~0x00000002);
				   return this;
			   }

			   public Builder clone() {
				   return create().mergeFrom(buildPartial());
			   }

			   public com.google.protobuf.Descriptors.Descriptor
			   getDescriptorForType() {
				   return LCPacket.internal_static_Packets_Login_descriptor;
			   }

			   public Login getDefaultInstanceForType() {
				   return Login.getDefaultInstance();
			   }

			   public Login build() {
				   Login result = buildPartial();
				   if (!result.isInitialized()) {
					   throw newUninitializedMessageException(result);
				   }
				   return result;
			   }

			   public Login buildPartial() {
				   Login result = new Login(this);
				   int from_bitField0_ = bitField0_;
				   int to_bitField0_ = 0;
				   if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
					   to_bitField0_ |= 0x00000001;
				   }
				   result.username_ = username_;
				   if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
					   to_bitField0_ |= 0x00000002;
				   }
				   result.password_ = password_;
				   result.bitField0_ = to_bitField0_;
				   onBuilt();
				   return result;
			   }

			   public Builder mergeFrom(com.google.protobuf.Message other) {
				   if (other instanceof Login) {
					   return mergeFrom((Login)other);
				   } else {
					   super.mergeFrom(other);
					   return this;
				   }
			   }

			   public Builder mergeFrom(Login other) {
				   if (other == Login.getDefaultInstance()) return this;
				   if (other.hasUsername()) {
					   bitField0_ |= 0x00000001;
					   username_ = other.username_;
					   onChanged();
				   }
				   if (other.hasPassword()) {
					   bitField0_ |= 0x00000002;
					   password_ = other.password_;
					   onChanged();
				   }
				   this.mergeUnknownFields(other.getUnknownFields());
				   return this;
			   }

			   public final boolean isInitialized() {
				   if (!hasUsername()) {

					   return false;
				   }
				   if (!hasPassword()) {

					   return false;
				   }
				   return true;
			   }

			   public Builder mergeFrom(
					   com.google.protobuf.CodedInputStream input,
					   com.google.protobuf.ExtensionRegistryLite extensionRegistry)
							   throws java.io.IOException {
				   Login parsedMessage = null;
				   try {
					   parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				   } catch (com.google.protobuf.InvalidProtocolBufferException e) {
					   parsedMessage = (Login) e.getUnfinishedMessage();
					   throw e;
				   } finally {
					   if (parsedMessage != null) {
						   mergeFrom(parsedMessage);
					   }
				   }
				   return this;
			   }
			   private int bitField0_;

			   private Object username_ = "";
			   /**
			    * <code>required string username = 1;</code>
			    */
			    public boolean hasUsername() {
			    	return ((bitField0_ & 0x00000001) == 0x00000001);
			    }
			    /**
			     * <code>required string username = 1;</code>
			     */
			    public String getUsername() {
			    	Object ref = username_;
			    	if (!(ref instanceof String)) {
			    		com.google.protobuf.ByteString bs =
			    				(com.google.protobuf.ByteString) ref;
			    		String s = bs.toStringUtf8();
			    		if (bs.isValidUtf8()) {
			    			username_ = s;
			    		}
			    		return s;
			    	} else {
			    		return (String) ref;
			    	}
			    }
			    /**
			     * <code>required string username = 1;</code>
			     */
			    public com.google.protobuf.ByteString
			    getUsernameBytes() {
			    	Object ref = username_;
			    	if (ref instanceof String) {
			    		com.google.protobuf.ByteString b = 
			    				com.google.protobuf.ByteString.copyFromUtf8(
			    						(String) ref);
			    		username_ = b;
			    		return b;
			    	} else {
			    		return (com.google.protobuf.ByteString) ref;
			    	}
			    }
			    /**
			     * <code>required string username = 1;</code>
			     */
			    public Builder setUsername(
			    		String value) {
			    	if (value == null) {
			    		throw new NullPointerException();
			    	}
			    	bitField0_ |= 0x00000001;
			    	username_ = value;
			    	onChanged();
			    	return this;
			    }
			    /**
			     * <code>required string username = 1;</code>
			     */
			    public Builder clearUsername() {
			    	bitField0_ = (bitField0_ & ~0x00000001);
			    	username_ = getDefaultInstance().getUsername();
			    	onChanged();
			    	return this;
			    }
			    /**
			     * <code>required string username = 1;</code>
			     */
			    public Builder setUsernameBytes(
			    		com.google.protobuf.ByteString value) {
			    	if (value == null) {
			    		throw new NullPointerException();
			    	}
			    	bitField0_ |= 0x00000001;
			    	username_ = value;
			    	onChanged();
			    	return this;
			    }

			    private Object password_ = "";
			    /**
			     * <code>required string password = 2;</code>
			     */
			    public boolean hasPassword() {
			    	return ((bitField0_ & 0x00000002) == 0x00000002);
			    }
			    /**
			     * <code>required string password = 2;</code>
			     */
			    public String getPassword() {
			    	Object ref = password_;
			    	if (!(ref instanceof String)) {
			    		com.google.protobuf.ByteString bs =
			    				(com.google.protobuf.ByteString) ref;
			    		String s = bs.toStringUtf8();
			    		if (bs.isValidUtf8()) {
			    			password_ = s;
			    		}
			    		return s;
			    	} else {
			    		return (String) ref;
			    	}
			    }
			    /**
			     * <code>required string password = 2;</code>
			     */
			    public com.google.protobuf.ByteString
			    getPasswordBytes() {
			    	Object ref = password_;
			    	if (ref instanceof String) {
			    		com.google.protobuf.ByteString b = 
			    				com.google.protobuf.ByteString.copyFromUtf8(
			    						(String) ref);
			    		password_ = b;
			    		return b;
			    	} else {
			    		return (com.google.protobuf.ByteString) ref;
			    	}
			    }
			    /**
			     * <code>required string password = 2;</code>
			     */
			    public Builder setPassword(
			    		String value) {
			    	if (value == null) {
			    		throw new NullPointerException();
			    	}
			    	bitField0_ |= 0x00000002;
			    	password_ = value;
			    	onChanged();
			    	return this;
			    }
			    /**
			     * <code>required string password = 2;</code>
			     */
			    public Builder clearPassword() {
			    	bitField0_ = (bitField0_ & ~0x00000002);
			    	password_ = getDefaultInstance().getPassword();
			    	onChanged();
			    	return this;
			    }
			    /**
			     * <code>required string password = 2;</code>
			     */
			    public Builder setPasswordBytes(
			    		com.google.protobuf.ByteString value) {
			    	if (value == null) {
			    		throw new NullPointerException();
			    	}
			    	bitField0_ |= 0x00000002;
			    	password_ = value;
			    	onChanged();
			    	return this;
			    }

			    // @@protoc_insertion_point(builder_scope:Packets.Login)
		   }

		   static {
			   defaultInstance = new Login(true);
			   defaultInstance.initFields();
		   }

		   // @@protoc_insertion_point(class_scope:Packets.Login)
	}

	private static final com.google.protobuf.Descriptors.Descriptor
	internal_static_Packets_Login_descriptor;
	private static
	com.google.protobuf.GeneratedMessage.FieldAccessorTable
	internal_static_Packets_Login_fieldAccessorTable;

	public static com.google.protobuf.Descriptors.FileDescriptor
	getDescriptor() {
		return descriptor;
	}
	private static com.google.protobuf.Descriptors.FileDescriptor
	descriptor;
	static {
		String[] descriptorData = {
				"\n\016LCPacket.proto\022\007Packets\"+\n\005Login\022\020\n\010us" +
						"ername\030\001 \002(\t\022\020\n\010password\030\002 \002(\tB!\n\025com.ga" +
						"me.lll.protobufB\010LCPacket"
		};
		com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
				new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
			public com.google.protobuf.ExtensionRegistry assignDescriptors(
					com.google.protobuf.Descriptors.FileDescriptor root) {
				descriptor = root;
				return null;
			}
		};
		com.google.protobuf.Descriptors.FileDescriptor
		.internalBuildGeneratedFileFrom(descriptorData,
				new com.google.protobuf.Descriptors.FileDescriptor[] {
		}, assigner);
		internal_static_Packets_Login_descriptor =
				getDescriptor().getMessageTypes().get(0);
		internal_static_Packets_Login_fieldAccessorTable = new
				com.google.protobuf.GeneratedMessage.FieldAccessorTable(
						internal_static_Packets_Login_descriptor,
						new String[] { "Username", "Password", });
	}

	// @@protoc_insertion_point(outer_class_scope)
}
